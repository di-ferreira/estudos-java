package classe;

public class DataTeste {
    public static void main(String[] args) {

        Data dtInicial = new Data();

        Data dt01 = new Data(3, 3, 1987);

        Data dt03 = new Data();
        dt03.dia = 11;
        dt03.mes = 3;
        dt03.ano = 1985;

        Data dt02 = new Data();
        dt02.dia = 20;
        dt02.mes = 8;
        dt02.ano = 2017;

        String niverDiego = "Diego nasceu dia " + dt01.dia + " do mês " + dt01.mes + " no ano " + dt01.ano;
        String niverPri = "Priscila nasceu dia " + dt03.dia + " do mês " + dt03.mes + " no ano " + dt03.ano;
        String niverAquiles = "Aquieles nasceu dia " + dt02.dia + " do mês " + dt02.mes + " no ano " + dt02.ano;

        System.out.println(niverDiego + ",\n" + niverPri + ",\n" + niverAquiles + ".");
        System.out.println(dtInicial.obterData());
        System.out.println(dt01.obterData());
        System.out.println(dt03.obterDataFormatada());
        System.out.println(dt02.obterData());

    }
}
