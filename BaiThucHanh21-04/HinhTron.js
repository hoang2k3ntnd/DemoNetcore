package HinhHoc;

public class HinhTron extends HinhHoc {
	public final float Pi = 3.14f;
	public float BanKinh;
	public HinhTron(String Ten, float BanKinh) {
		super(Ten);
		this.BanKinh = BanKinh;
	}

	public void setBanKinh(float BanKinh) {
		this.BanKinh = BanKinh;
	}
	public float getBanKinh() {
		return BanKinh;
	}
	@Override
	public float ChuVi() {
		return 2 * Pi * BanKinh;
	}
	@Override
	public float  DienTich() {
		return Pi * BanKinh * BanKinh;
	}
}