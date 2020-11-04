package src;

public interface Subject {
	void add(Observer o);
	void notifyOb();
	void quit(Observer o);
}
