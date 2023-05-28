package domein;

import java.util.List;

public class PancakeMenuIterator implements Iterator {

	private List<MenuItem> children;
	private int pointer = 0;
	
	public PancakeMenuIterator(List<MenuItem> list) {
		this.children = list;
	}
	
	@Override
	public boolean hasNext() {
		return (children.size() > pointer && children.get(pointer) != null);
	}

	@Override
	public Object next() {
		MenuItem item = children.get(pointer);
		pointer += 1;
		return item;
	}

}
