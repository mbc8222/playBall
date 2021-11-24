package vo;

public class CovidVo {
	//확진자 수
	String decide_cnt;
	//격리해제 수
	String clear_cnt;
	//검사진행 수
	String exam_cnt;
	//사망자 수
	String death_cnt;
	//치료중 환자 수
	String care_cnt;
	//결과 음성 수
	String result_neg_cnt;
	//누적 검사 수
	String acc_exam_comp_cnt;
	//누적 확진률
	String acc_def_rate;
	
	public String getDecide_cnt() {
		return decide_cnt;
	}
	public void setDecide_cnt(String decide_cnt) {
		this.decide_cnt = decide_cnt;
	}
	public String getClear_cnt() {
		return clear_cnt;
	}
	public void setClear_cnt(String clear_cnt) {
		this.clear_cnt = clear_cnt;
	}
	public String getExam_cnt() {
		return exam_cnt;
	}
	public void setExam_cnt(String exam_cnt) {
		this.exam_cnt = exam_cnt;
	}
	public String getDeath_cnt() {
		return death_cnt;
	}
	public void setDeath_cnt(String death_cnt) {
		this.death_cnt = death_cnt;
	}
	public String getCare_cnt() {
		return care_cnt;
	}
	public void setCare_cnt(String care_cnt) {
		this.care_cnt = care_cnt;
	}
	public String getResult_neg_cnt() {
		return result_neg_cnt;
	}
	public void setResult_neg_cnt(String result_neg_cnt) {
		this.result_neg_cnt = result_neg_cnt;
	}
	public String getAcc_exam_comp_cnt() {
		return acc_exam_comp_cnt;
	}
	public void setAcc_exam_comp_cnt(String acc_exam_comp_cnt) {
		this.acc_exam_comp_cnt = acc_exam_comp_cnt;
	}
	public String getAcc_def_rate() {
		return acc_def_rate;
	}
	public void setAcc_def_rate(String acc_def_rate) {
		this.acc_def_rate = acc_def_rate;
	}
	
	
	
	
	
}
