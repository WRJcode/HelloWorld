package arvin.java.io.demo.piped.bytes;

import java.io.IOException;
import java.io.PipedOutputStream;

public class PipedSender extends Thread{
    //定义私有PipedOutputStream对象
    private PipedOutputStream out = new PipedOutputStream();

    public  PipedOutputStream getOutputStream(){
        return out;
    }

    @Override
    public void run(){
        writeMove();
        //writeOne();
    }

    /**
     * 写入一段短数据
     */
    private void writeOne(){
        byte[] buffer = "this is a message".getBytes();
        try{
            out.write(buffer);
        }catch(IOException e){
            e.printStackTrace();
        }finally {
            try{
                if(out != null){
                    out.close();
                }
            } catch(Exception e){
                e.printStackTrace();
            }
        }
    }

    /**
     * 写入一段长数据
     */
    public void writeMove(){
        StringBuffer sb = new StringBuffer();
        for(int i = 0;i<100;i++){
            sb.append("1234567890");
        }
        sb.append("abcdefghijklmnopqrstuvwxyz");
        String str = sb.toString();
        try{
            out.write(str.getBytes());
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            try{
                if(out != null){
                    out.close();
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
