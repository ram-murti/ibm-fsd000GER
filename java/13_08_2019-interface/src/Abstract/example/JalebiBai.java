package Abstract.example;

public class JalebiBai extends Model {

	private static final Object Object = null;
	public int start;
	public int end;
	public JalebiBai(int start,int end) {
		this.start=start;
		this.end=end;
	}
	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public int calculateLength() {
		return this.start-this.end;
	}

	@Override
	public boolean isGreater(Object obj) {
		JalebiBai l = (JalebiBai)obj;
		System.out.println(l.calculateLength()+" "+this.calculateLength());
		
		return this.calculateLength()>l.calculateLength();
	}

	@Override
	public boolean isLesser(Object obj) {
		// TODO Auto-generated method stub
     JalebiBai l = (JalebiBai)obj;
		
		return this.calculateLength()<l.calculateLength();
	}

	@Override
	public boolean isEquals(Object obj) {
		// TODO Auto-generated method stub
           JalebiBai l = (JalebiBai)obj;
		
		return this.calculateLength()==l.calculateLength();
	}

}
