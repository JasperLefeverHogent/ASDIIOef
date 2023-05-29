package domein;

public interface Iterator {

	Channel nextChannel();

	Channel prevChannel();

	boolean hasNext();

	boolean hasPrev();
}
