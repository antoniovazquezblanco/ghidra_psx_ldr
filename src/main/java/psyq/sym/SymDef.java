package psyq.sym;

public class SymDef extends SymObject {
	private final SymDefClass defClass;
	private final SymDefType defType;
	private final long size;
	private final String name;
	
	private Long[] dims;
	private String defTag;
	
	public SymDef(SymDefClass defClass, SymDefType defType, long size, String name, long offset) {
		super(offset);
		
		this.defClass = defClass;
		this.defType = defType;
		this.size = size;
		this.name = name;
		this.dims = null;
		this.defTag = null;
	}

	public SymDefClass getDefClass() {
		return defClass;
	}

	public SymDefType getDefType() {
		return defType;
	}

	public long getSize() {
		return size;
	}

	public String getName() {
		return name;
	}
	
	public void setDims(Long[] dims) {
		this.dims = dims.clone();
	}
	
	public void setDefTag(String defTag) {
		this.defTag = defTag;
	}
	
	public Long[] getDims() {
		return dims;
	}
	
	public String getDefTag() {
		return defTag;
	}
}
