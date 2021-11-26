package chapter02;
// 접근제어자 - default(null값), private
class Unit_ {
	
	// 미리미터
	private int mm;
	// 센치미터
	private int cm;
	// 미터
	private int m;
	// 인치
	private double in;
	// 피트
	private double ft;
	
	public Unit_(int mm, int cm, int m, double in, double ft) {
		this.mm = mm;
		this.cm = cm;
		this.m = m;
		this.in = in;
		this.ft = ft;
	}
	// private선언 되어 있는 것을 외부에서
	// 사용할 수 있게 특별한 기능을 만들어준다.
	public int getMm() {
		return mm;
	}
	// 바꿔주는 역할을 만들어준다.
	public void setMm(int mm) {
		this.mm = mm;
	}
	
	// 자동으로 getter, setter 를 만들어 줄 수도 있다.
	public int getCm() {
		return cm;
	}
	public void setCm(int cm) {
		this.cm = cm;
	}
	public int getM() {
		return m;
	}
	public void setM(int m) {
		this.m = m;
	}
	public double getIn() {
		return in;
	}
	public void setIn(double in) {
		this.in = in;
	}
	public double getFt() {
		return ft;
	}
	public void setFt(double ft) {
		this.ft = ft;
	}
	
}
