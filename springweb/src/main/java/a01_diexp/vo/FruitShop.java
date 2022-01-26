package a01_diexp.vo;

import java.util.Properties;
import java.util.Set;

public class FruitShop {
	// 물건명을 중복되지 않게 담을 Set 객체 선언
	private Set<String> prod;
	// 물건명에 연계되어 있는 값을 설정할 수 있는 Properties 객체 선언
	private Properties prodInfo;
	public FruitShop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Set<String> getProd() {
		return prod;
	}
	// set객체를 저장할 메서드
	public void setProd(Set<String> prod) {
		this.prod = prod;
	}
	public Properties getProdInfo() {
		return prodInfo;
	}
	// properties 객체를 저장할 메서드
	public void setProdInfo(Properties prodInfo) {
		this.prodInfo = prodInfo;
	}
	public String toString() {
		return "FruitShop [prod="+prod+", prodInfo="+prodInfo+"]";
	}
	
}
