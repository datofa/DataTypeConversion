/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kecoro
 */

public class Data {
    
    int len;
    
    public int toInt(){
        return 0;
    }
    
    public int length(int in){
        len = (int) (Math.log10(in)+1);
        return len;
    }

    public int length(byte[] in){
        len = in.length;
        return len;
    }
    
    public int length(byte in){
        len = (int) (Math.log10(in)+1);
        return len;
    }
    
    public int length(long in){
        len = (int) (Math.log10(in)+1);
        return len;
    }
    
    public byte[] toByteArray(int in){
        byte[] r = new byte[0];
        len = length(in);
        for(int j = 0; j<len ; j++){
            r[j] = (byte) (long) (((in% Math.pow(10, ( len-j)))-((in% Math.pow(10, (len-(j+1))))))/Math.pow(10, (len-(j+1))));
        }
        return r;
    }
    
    public int toInt(byte[] in){
        int len = in.length; int r=0; int i =0;
        for(byte a:in){
            r += a*Math.pow(10, ((len-1)-i));
            i++;
        }
        return r;
    }
    
    public int toInt(byte[] in, int len){
        int r=0; int i =0;
        for(byte a:in){
            r += a*Math.pow(10, ((len-1)-i));
            i++;
        }
        return r;
    }
    
    public long toLong(byte[] in){
        long len = in.length; long r=0; int i =0;
        for(byte a:in){
            r += a*Math.pow(10, ((len-1)-i));
            i++;
        }
        return r;
    }
    
    public long toLong(byte[] in, int len){
        long r=0; int i =0;
        for(byte a:in){
            r += a*Math.pow(10, ((len-1)-i));
            i++;
        }
        return r;
    }
}
