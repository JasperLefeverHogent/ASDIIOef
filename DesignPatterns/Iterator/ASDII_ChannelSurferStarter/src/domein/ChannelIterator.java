package domein;

public class ChannelIterator implements Iterator {
	
	private int maxChannels;
	private int pointer = 0;
	
	public ChannelIterator(int maxChannels) {
		this.maxChannels = maxChannels;
	}

	public Channel nextChannel() {
		pointer = (pointer + 1) % maxChannels;
		return new Channel(pointer);
	}

	public Channel prevChannel() {
		pointer = (pointer - 1 + maxChannels) % maxChannels;
		return new Channel(pointer);
	}

	public boolean hasNext() {
		throw new UnsupportedOperationException();
	}

	public boolean hasPrev() {
		throw new UnsupportedOperationException();
	}
}
