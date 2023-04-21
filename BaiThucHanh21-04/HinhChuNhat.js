package HinhHoc;


public class HinhChuNhat extends HinhHoc {
	private float Dai;
	private float Rong;
	public HinhChuNhat(String Ten, float Dai, float Rong) {
		super(Ten);
		this.Rong = Rong;
		this.Dai = Dai;
	}


	public float getDai() {
		return Dai;
	}
	public  void setDai(float Dai) {
		this.Dai = Dai;
	}

	public  float getRong() {
		return Rong;
	}
	public void setRong(float Rong) {
		this.Rong = Rong;
	}
	@Override
	public float  ChuVi() {
		return (Dai + Rong) * 2;
	}
	@Override
	public float  DienTich() {
		return Dai * Rong;
	}

}
