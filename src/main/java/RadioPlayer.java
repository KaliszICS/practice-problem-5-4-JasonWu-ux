public class RadioPlayer implements Player {
    private boolean onOff;
    private double[] stationList;
    private int volume;
    private double station;
    private int currentIndex;
    
    public RadioPlayer(double[] stationList) {
        this.stationList = stationList;
        this.volume = 0;
        this.onOff = false;
        this.station = 0;
        this.currentIndex = 0;
    }
    
    @Override
    public void start() {
        if (!onOff) {
            onOff = true;
            if (stationList.length > 0) {
                station = stationList[0];
                currentIndex = 0;
            }
        }
    }
    
    @Override
    public void stop() {
        if (onOff) {
            onOff = false;
            station = 0;
        }
    }
    
    @Override
    public void volumeUp() {
        volume += 2;
    }
    
    @Override
    public void volumeDown() {
        volume -= 2;
    }
    
    @Override
    public int getVolume() {
        return volume;
    }
    
    public boolean getOnOff() {
        return onOff;
    }
    public void next() {
        if (currentIndex < stationList.length) {

        currentIndex++;
    } else
    { currentIndex = 0;

    }
    station = stationList[currentIndex];
}
 public void previous() {
        if (currentIndex > 0) {
            currentIndex--;
        } else {
            currentIndex = stationList.length - 1;
        }
        station = stationList[currentIndex];
    }

    public double getStation() {
        return station;

    }
}