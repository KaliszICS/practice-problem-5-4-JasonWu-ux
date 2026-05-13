public class MusicPlayer implements Player {
    private boolean onOff;
    private String[] musicList;
    private String currentSong;
    private int volume;
    private int currentIndex;

    public MusicPlayer(String[] musicList) {
        this.musicList = musicList;
        this.volume = 0;
        this.onOff = false;
        this.currentSong = "";
        this.currentIndex = 0;
    }
    
    @Override
    public void start() {
        if (!onOff) {
            onOff = true;
            if (musicList.length > 0) {
                currentSong = musicList[0];
                currentIndex = 0;
            }
        }
    }
    
    @Override
    public void stop() {
        if (onOff) {
            onOff = false;
            currentSong = "";
        }
    }
    
    @Override
    public void volumeUp() {
        volume++;
    }
    
    @Override
    public void volumeDown() {
        volume--;
    }
    
    @Override
    public int getVolume() {
        return volume;
    }
    
    public boolean getOnOff() {
        return onOff;
    }
        public void next() {
            if (currentIndex < musicList.length - 1) {
                currentIndex++;
            } else {
                currentIndex = 0;
            }
            currentSong = musicList[currentIndex];
        }

        public void previous() {
            if (currentIndex > 0) {
                currentIndex--;
            }
            else {
                currentIndex = musicList.length - 1;
        }
        currentSong = musicList[currentIndex];

}
public String getCurrentSong() {
        return currentSong;
    }
}


