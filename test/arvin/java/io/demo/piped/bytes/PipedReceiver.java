package arvin.java.io.demo.piped.bytes;


import java.io.IOException;
import java.io.PipedInputStream;

public class PipedReceiver extends Thread{

    //私有PipedInputStream对象
    private PipedInputStream in = new PipedInputStream();

    public PipedInputStream getInputStream(){
        return in;
    }

    @Override
    public void run(){
        readMove();
        //readOne();
    }

    /**
     * 读取一次
     */
    public void readOne(){
        byte[] buffer = new byte[1024];
        int len = 0;
        try{
            len = in.read(buffer);
            System.out.println(new String(buffer,0,len));
        } catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                if(in != null){
                    in.close();
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }

    /**
     * 读取多次
     */
    private void readMove(){
        byte[] buffer = new byte[300];
        int len = 0;
        try{
            while(true){
                len = in.read(buffer);
                if(len == -1){
                    break;
                }
                System.out.println(new String(buffer,0,len));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            try{
                if(in != null){
                    in.close();
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
