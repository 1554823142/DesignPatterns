public interface Subject {
    public void registorObserver(Observer o);
    public void RemoveObserver(Observer o);
    public void notifyObservers();
}


