package ObserverPattern;

public interface Subject {

	public void registerObserver(DataObserver dataObserver);
	public void removeObserver(DataObserver dataObserver);
	public void notifyObserver();
}
