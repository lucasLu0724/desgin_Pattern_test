package teligen;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class downTest {
    //20200225 to_do_list
    /**
     * 写一个下载url api
     * 通过黑马重新学习"流"
     * 通过api工具了解URL 的API 方法
     *
     */

    public static void DownloadTest(Integer times){
        for(int j=0;j<=times;j++){
            System.out.println("第"+j+"次运行");
            //1.设定url
            String urlStr ="http://192.168.59.130:8080/WebReport/decision/view/report?viewlet=Macao%252Fjan%252FAnexo-A1-A7.cpt&ref_t=design&ref_c=b4a02a54-aa2a-4ac2-b8d8-4aac24fc77de&format=pdf";
            //2.获取工具
            try {
                System.out.println("开始运行");
                URL url =new URL(urlStr);
                URLConnection connection = url.openConnection();
                BufferedInputStream br =new BufferedInputStream(connection.getInputStream());
                byte[] data = new byte[1024];
                String filePath="C:\\Users\\mi\\Desktop\\下载文件\\test";
                String poxName=".pdf";
                int fileNameIndex=1;
                File file = new File(filePath+poxName);
                while(file.exists()){
                    file = new File(filePath+"("+(fileNameIndex++)+")"+poxName);
                }
                file.createNewFile();
                FileOutputStream fos =new FileOutputStream(file);
                int index ;
                while((index = br.read(data))!=-1){
                    fos.write(data,0,index);
                }
                System.out.println("输出完毕");

            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        DownloadTest(20);
    }
}
