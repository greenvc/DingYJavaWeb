package Objects.InnerClass;

public class Goods {
	 private class Content implements Contents {
	        private int i = 11;
	        public int value() {
	            return i;
	        }
	    }
	 
	    protected class GDestination implements Destination {
	        private String label;
	        private GDestination(String WhereTo) {
	            label = WhereTo;
	        }
	        public String readLabel() {
	            return label;
	        }
	    }
	    
	    public Destination dest(String Location) {
	    	System.out.print("隐藏你不想让别人知道的操作, 接收到参数:" + s);
	    	
	        return new GDestination(s);
	    }
	    
	    public Contents cont() {
	        return new Content();
	    }
}