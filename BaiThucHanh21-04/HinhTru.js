package HinhHoc;


public class HinhTru extends HinhTron {
	public float ChieuCao;
	public HinhTru(String Ten, float ChieuCao, float BanKinh) {
		super(Ten, BanKinh);
		this.ChieuCao = ChieuCao;

	}
	@Override
	public float DienTich() {
		return (Pi * BanKinh * BanKinh) + (2 * Pi * BanKinh * ChieuCao);
	}
	@Override
	public float  TheTich() {
		return Pi * BanKinh * BanKinh * ChieuCao;
	}

}