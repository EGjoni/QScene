package math;

public interface Vec<T extends Vec<T>>{
	public float getXf();
	public float getYf();
	public float getZf();
	public double getXd();
	public double getYd();
	public double getZd();
	public T copy();
}
