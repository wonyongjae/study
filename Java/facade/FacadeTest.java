package design_pattern.facade;

public class FacadeTest {
    public static void main(String[] args) {

        // facade 사용 X
        // Ftp ftpClient = new Ftp("www.fo.kr", 22, "/home/etc");
        // ftpClient.connect();
        // ftpClient.moveDirectory();
        // Writer writer = new Writer("text.tmp");
        // writer.fileConnect();
        // writer.write();
        // Reader reader = new Reader("text.tmp");
        // reader.fileConnect();
        // reader.fileRead();
        // reader.fileDisconnect();
        // writer.fileDisconnect();
        // ftpClient.disConnect();

        // facade 사용
        SftpClient sftpClient = new SftpClient("www.fo.kr", 22, "/home/etc", "text.tmp");
        sftpClient.connect();
        sftpClient.write();
        sftpClient.read();
        sftpClient.disConnect();

    }
}
