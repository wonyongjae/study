package mission1;

public interface BoardInterface<T> {
	
	void list();
	void upload(T t);
	void detail(int index);
	T get(int index);
}
