package br.com.mariojp.solid.isp;

public class OfficeService {
    private final MultiFunctionDevice device;
    public OfficeService(MultiFunctionDevice device){ this.device = device; }
    public void printReport(String content){
        device.print(content);
    }
    public void scanReport(String content) {
    	device.scan("audit.txt");
	}
}
