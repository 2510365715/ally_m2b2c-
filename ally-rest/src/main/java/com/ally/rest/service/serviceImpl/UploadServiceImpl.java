package com.ally.rest.service.serviceImpl;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketException;
import java.util.List;
import java.util.UUID;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.ally.rest.po.UploadResult;
import com.ally.rest.service.UploadService;

@Service
public class UploadServiceImpl implements UploadService {
	//ftp��������Ϣ
	public static final String SERVER_IP = "139.199.210.223";  
	public static final int PORT = 21;  
	public static final String USERNAME = "ftpuser";  
	public static final String PASSWORD = "ally123.";
	public static final String UPLOAD_PATH = "images/";
	@Override
	public UploadResult uploadPic(List<MultipartFile> uploadfile) throws Exception {
		// TODO Auto-generated method stub
		UploadResult result = new UploadResult(); 
		//�ж��ϴ��ļ��Ƿ����
		if (!uploadfile.isEmpty() && uploadfile.size() > 0) {
			//ѭ������ϴ����ļ�
			for (MultipartFile file : uploadfile) { 
				//��ȡ�ϴ��ļ���ԭʼ����
				String oringinalFilename = file.getOriginalFilename();
				//��ȡԴ�ļ�����׺
				String prefixName = FilenameUtils.getExtension(oringinalFilename);

				int fileSize = 3145728;
				//ͼƬ������500k����
				if(file.getSize() > fileSize) {
					result.setCode("0");
					return result;
				} else if(prefixName.equalsIgnoreCase("jpg")
						|| prefixName.equalsIgnoreCase("png")
						|| prefixName.equalsIgnoreCase("jpeg")
						|| prefixName.equalsIgnoreCase("pneg")) {
					FTPClient ftp = new FTPClient();
					try {
						int reply;
						ftp.connect(SERVER_IP,PORT);// ����FTP������
						//�������Ĭ�϶˿ڣ�����ʹ��ftp.connect(url)�ķ�ʽֱ������FTP������
						ftp.login(USERNAME, PASSWORD);// ��¼
						reply = ftp.getReplyCode();
						if (!FTPReply.isPositiveCompletion(reply)) {
							ftp.disconnect();
						}
						ftp.enterLocalPassiveMode();
						if (!ftp.changeWorkingDirectory(UPLOAD_PATH)) {
							ftp.makeDirectory(UPLOAD_PATH);//����Ŀ¼
							ftp.changeWorkingDirectory(UPLOAD_PATH);//��תĿ¼(�ɸ�����Ŀ����ѡ�񴴽�Ŀ¼�Ķ���)
						}
						/*if (!ftp.changeWorkingDirectory(id)) {
							ftp.makeDirectory(id);
							ftp.changeWorkingDirectory(id);
						}*/
						ftp.setFileType(FTP.BINARY_FILE_TYPE);
						//ʹ��UUID��������
						String newFilename = UUID.randomUUID().toString() + "."+prefixName;
						InputStream input = file.getInputStream();
						ftp.storeFile(newFilename, input);
						result.setCode("200");
						result.setPath("ftp://"+USERNAME+":"+PASSWORD+"@139.199.210.223/images/"+newFilename);
						input.close();
						ftp.logout();
					} catch (IOException e) {
						e.printStackTrace();
						result.setCode("1");
						return result;
					} finally {
						if (ftp.isConnected()) {
							try {
								ftp.disconnect();
							} catch (IOException ioe) {
								ioe.printStackTrace();
							}
						}
					}
					/*//�����ϴ��ļ��ı����ַĿ¼
					String dirPath = "http://39.108.113.97:21/";
					String dirPath = "d:/";
					System.out.println("dirpath==" + dirPath);
					File filePath = new File(dirPath);
					//����ļ���ַ������ �򴴽�Ŀ¼
					if (!filePath.exists()) {
						filePath.mkdirs();
					}
					//ʹ��ʱ���ʽ��������
					String newFilename = UUID.randomUUID().toString() + "."+prefixName;
					System.out.println(newFilename);
					try {
						//ʹ��MultipartFilr�ӿڵķ�������ļ��ϴ���ָ��λ��
						file.transferTo(new File(dirPath + newFilename));
						String filepath = dirPath + newFilename;
						result.setCode("200");
						result.setPath(filepath);
					} catch (IOException e) {
						result.setCode("1");
						return result;
					}*/
				} else {
					System.out.println("�ϴ�ͼƬ��ʽ����ȷ");
					result.setCode("3");
					return result;
				}
			}
			//�ϴ��ɹ�
			return result;
		} else {
			result.setCode("404");
			return result;
		}
	}

	/**
	 * ͼƬ�ϴ�
	 * @param
	 * @param uploadfile
	 * @param request
	 * @return
	 */
	/* @RequestMapping("/fileUpload")
    @ResponseBody
    public UploadResult handleFormUpload(@RequestParam("uploadfile") List<MultipartFile> uploadfile,
                                   HttpServletRequest request) {
        UploadResult result = new UploadResult();
        //�ж��ϴ��ļ��Ƿ����
        if (!uploadfile.isEmpty() && uploadfile.size() > 0) {
            //ѭ������ϴ����ļ�
            for (MultipartFile file : uploadfile) {
                //��ȡ�ϴ��ļ���ԭʼ����
                String oringinalFilename = file.getOriginalFilename();
                //��ȡԴ�ļ�����׺
                String prefixName = FilenameUtils.getExtension(oringinalFilename);

                int fileSize = 500000;
                //ͼƬ������500k����
                if(file.getSize() > fileSize) {
                    result.setCode("0");
                    return result;
                } else if(prefixName.equalsIgnoreCase("jpg")
                        || prefixName.equalsIgnoreCase("png")
                        || prefixName.equalsIgnoreCase("jpeg")
                        || prefixName.equalsIgnoreCase("pneg")) {
                    //�����ϴ��ļ��ı����ַĿ¼
                    String dirPath = "http://39.108.113.97:21/";
                    //����windows��linux��\ �� /
                    //String dirPath = "E:"+System.getProperty("file.separator")+"uploadfile" + System.getProperty("file.separator");
                    //String dirPath = System.getProperty("file.separator") + "usr" + System.getProperty("file.separator") + "local"
                           // + System.getProperty("file.separator")+"imgbak"+System.getProperty("file.separator");
                    System.out.println("dirpath==" + dirPath);
                    File filePath = new File(dirPath);
                    //����ļ���ַ������ �򴴽�Ŀ¼
                    if (!filePath.exists()) {
                        filePath.mkdirs();
                    }
                    //ʹ��ʱ���ʽ��������
                    String newFilename = UUID.randomUUID().toString() + "."+prefixName;
                    System.out.println(newFilename);
                    try {
                        //ʹ��MultipartFilr�ӿڵķ�������ļ��ϴ���ָ��λ��
                        file.transferTo(new File(dirPath + newFilename));
                        String filepath = dirPath + newFilename;
                        result.setCode("200");
                        result.setPath(filepath);
                    } catch (IOException e) {
                        result.setCode("1");
                        return result;
                    }
                } else {
                    System.out.println("�ϴ�ͼƬ��ʽ����ȷ");
                    result.setCode("3");
                    return result;
                }
            }
            //�ϴ��ɹ�
            return result;
        } else {
            result.setCode("404");
            return result;
        }
    }*/
}
