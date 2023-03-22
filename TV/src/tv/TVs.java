/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tv;

/**
 *
 * @author Cyberfaour
 */
public class TVs {
        int channel=1;
        int volume=1;
        boolean on=false;
        
        public TVs(){
            
        }
        public void turnOn(){
            on=true;
        }
        public void turnOff(){
            on=false;
        }
        public void setChannel(int chan){
            if(on && chan>=1 && chan<=120)
                channel=chan;
            
        }
        public void setVolume(int vol){
            if(on && vol>=1 && vol<=7)
                 volume=vol;
        }
        public void channelNext(){
            if(on &&  channel<120)
                channel++;
        }
        public void channelPrrev(){
            if(on &&  channel>1)
                channel--;
        }
        public void volumeUp(){
            if(on &&volume<7)
                volume++;
        }
        public void volumeDown(){
            if(on && volume>1)
                volume--;
        }
        
}
