package ua.dp.ort.OOP_10;

/**
 * Данный интерфейс - массивы данных паспортов
 * (для иллюстрации массивы из двух элементов) 
 * @author Admin
 *
 */
public interface DataPassport {
	
	/**
	 * массив данных гражданских паспортов из двух элементов
	 * с проверкой двух конструкторов класса Passport
	 * @return - массив класса Passport
	 */
	public static Passport[] setDataPassport() {
		Passport[] passports = new Passport[2];
		Passport IvanovIIP = new Passport(
				"Иванов", 
				"Иван", 
				"Иванович", 
				"05.05.2000", 
				"г. Киев", 
				"АК 456456", 
				"10.06.2016");
		passports[0] = IvanovIIP;
		Passport SidorovSSP = new Passport();
		SidorovSSP.setSurname("Сидоров");
		SidorovSSP.setName("Сидор");
		SidorovSSP.setPatronymic("Сидорович");
		SidorovSSP.setDateOfBirth("11.02.1980");
		SidorovSSP.setPlaceOfBirth("г. Днепропетровск");
		SidorovSSP.setNumberPassport("АВ 123123");
		SidorovSSP.setDateOfIssue("03.03.1996");
		passports[1] = SidorovSSP;
		return passports;
		
	}
	
	/**
	 * массив данных загранпаспортов из двух элементов
	 * с проверкой двух конструкторов класса ForeignPassport
	 * @return - массив класса ForeignPassport
	 */
	public static ForeignPassport[] setDataForeignPassport() {
		ForeignPassport[] foreignPassports = new ForeignPassport[2];
		Visa IvanovIIV = new Visa(
				"шенген", 
				"рабочая", 
				"многократная", 
				"10.07.2016", 
				"10.07.2017");
		Visa SidorovSSV = new Visa();
		SidorovSSV.setTypeUnion("шенген");
		SidorovSSV.setTypePurpose("туристическая");
		SidorovSSV.setTypeAction("однократная");
		SidorovSSV.setDataOpen("01.07.2016");
		SidorovSSV.setDataClose("01.08.2016");
		ForeignPassport IvanovIIFP = new ForeignPassport(
				"ІВАНОВ/IVANOV", 
				"ІВАН/IVAN", 
				"ІВАНОВИЧ/IVANOVICH", 
				"05ТРА/MAY00", 
				"УКРАЇНА", 
				"FK232323", 
				"30ТРА/MAY16", 
				IvanovIIV, 
				"30ТРА/MAY26", 
				"УКРАЇНА/UKRAINE", 
				"UKR", 
				"01234567-01234", 
				"1201");
		foreignPassports[0] = IvanovIIFP;
		ForeignPassport SidorovSSFP = new ForeignPassport();
		SidorovSSFP.setSurname("СІДОРОВ/SIDOROV");
		SidorovSSFP.setName("СІДОР/SIDOR");
		SidorovSSFP.setPatronymic("СІДОРОВИЧ/SIDOROVICH");
		SidorovSSFP.setDateOfBirth("11ЛЮТ/FEB80");
		SidorovSSFP.setPlaceOfBirth("УКРАЇНА");
		SidorovSSFP.setNumberPassport("FE121212");
		SidorovSSFP.setDateOfIssue("25ТРА/MAY16");
		SidorovSSFP.setVisaData(SidorovSSV);
		SidorovSSFP.setDateOfExpiry("25ТРА/MAY26");
		SidorovSSFP.setNationality("УКРАЇНА/UKRAINE");
		SidorovSSFP.setCountryCode("UKR");
		SidorovSSFP.setRecordNo("12345678-12345");
		SidorovSSFP.setAuthority("1201");
		foreignPassports[1] = SidorovSSFP;
		return foreignPassports;
	}
}
