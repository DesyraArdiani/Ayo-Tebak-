/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codingan;

/**
 *
 * @author user
 */
import javax.sound.sampled.Clip;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;


public class Sound implements Runnable 
{
    
    static Sound player = new Sound();
    static String fileLocation = "D:\\TUBESPBOBISMILLAHJADI\\src\\musik\\menu.wav";
    static Clip clip;

    public Sound() { }

    public void play() 
    {
        Thread t = new Thread(this);
        t.start();
    }

    @Override
    public void run()
    {
        loadMusic(fileLocation);
    }
    
    
    public  void loadMusic(String fileLocation)
    {
        try 
        {
            File musicPath = new File(fileLocation);
            System.out.println(musicPath.getAbsolutePath());
            
            if(musicPath.exists())
            {
                System.out.println("Initialized");
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                clip = AudioSystem.getClip();
                clip.open(audioInput);
            }
        }
        
        catch(Exception e)
        {
            System.out.println("Yes");
        }
    }
}
