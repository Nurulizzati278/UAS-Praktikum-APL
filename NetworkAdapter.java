public class NetworkAdapter implements speed {
    speed p;

    public NetworkAdapter(speed p) {
        this.p = p;
    }

    @Override
    public String getKecepatan() {
        String getFirstFile = p.getKecepatan();
        return getFirstFile+" Mbps";
    }
}
