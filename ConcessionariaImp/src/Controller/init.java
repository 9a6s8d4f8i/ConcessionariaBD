/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.*;
import Model.DAO.*;
/**
 *
 * @author sarto
 */
public class init {
    public static void main(String[] args){
        
        
        //TESTES DO COMPRAVENDA DAO
//        CompraVendaDAO cvdao = new CompraVendaDAO();
//        ClienteModel cliente = new ClienteModel(2);
//        DataModel dataCompraVenda = new DataModel("25/11/2018");
//        VendedorModel vendedor = new VendedorModel("05345776144");
//        PvendaModel veiculo = new PvendaModel(7);
//        CompraVendaModel cv = new CompraVendaModel(cliente,dataCompraVenda,vendedor,veiculo,200,true);
//        cv.setIdCompraVenda(5);
//        cvdao.alterar(cv);
//       // cv = cvdao.consultar(7);
        //System.out.println(cv.toString());
        
        /*TESTES DO CLIENTE DAO
        ClienteDAO clientedao = new ClienteDAO();
        ClienteModel cliente = new ClienteModel();
        cliente.setIdCliente(4);
        cliente.setTelefone("98885");
        cliente.setNome("Marx");
        cliente.setCep("098324532");
        cliente.setComplemento("Puta que pariu a direita");
        cliente.setNumero("17");
        cliente.setNumCartao("35");
        cliente.setNumConta("03");
        
        cliente = clientedao.consultar(5);
        
        System.out.println(cliente.toString());
        */
                
        //TESTES DO ALUGUEL DAO
//        AluguelDAO alugueldao = new AluguelDAO();
//        PaluguelModel veiculo = new PaluguelModel(3);
//        ClienteModel cliente = new ClienteModel(2);
//        VendedorModel vendedor = new VendedorModel("05345776144");
//        RevisaoModel revisao = new RevisaoModel(3);
//        AluguelModel aluguel = new AluguelModel(veiculo,cliente,vendedor,revisao);
//        aluguel.setDataInicio(new DataModel("01/11/2018"));
//        aluguel.setDataFim(new DataModel("02/11/2018"));
//        aluguel.setKmRodados(100);
//        aluguel.setValorTotal(200);
//        aluguel.setMultaAtraso(17);
//        aluguel.setFinalizado(1);
//       // alugueldao.incluir(aluguel);
//        alugueldao.consultar(3,2,"05345776144",3);
//        System.out.println(aluguel.toString());

//        //TESTES DO FUNCIONARIO DAO
//        FuncionarioDAO funcionariodao = new FuncionarioDAO();
//        FuncionarioModel funcionario = new FuncionarioModel();
//        funcionario.setCpfFuncionario("12538119626");
//        funcionario.setNome("Sartori");
//        funcionario.setSalarioFixo(2000);
//        funcionario.setTelefone("92318504");
//        funcionariodao.incluir(funcionario);
//        
        //System.out.println(funcionario.toString());
        
//        //TESTES DO VENDEDOR DAO
//        VendedorDAO vendedordao = new VendedorDAO();
//        VendedorModel vendedor = new VendedorModel();
//        vendedor.setCpfFuncionario("12538119629");
//        vendedor.setSalarioFixo(1500);
//        vendedor.setNome("SartoriLeo");
//        vendedor.setTelefone("929292929");
//        vendedor.setPorcentagemComissao(5000);
//        vendedor.delete();
//        
       //System.out.println(vendedor.toString());
                
       // TESTE PALUGUEL
//       PaluguelDAO palugueldao = new PaluguelDAO();
//       PaluguelModel paluguel = new PaluguelModel();
//       paluguel.setIdVeiculo(6);
//       paluguel.setKm(100);
//       paluguel.setCor("branco");
//       paluguel.setModelo("F50");
//       paluguel.setMontadora("Fiat");
//       paluguel.setPlaca("KGB0011");
//       paluguel.setSituacao(0);
//       paluguel.setTipo("carro");
//       paluguel.setPrecoFixo((float) 450.80);
//       paluguel.setPrecoPorKm((float) 30.50);
//       paluguel.delete();
//       //System.out.println(paluguel.toString());
       
        //TESTE PFISICA
//        PfisicaDAO pfisicadao = new PfisicaDAO();
//        PfisicaModel pfisica = new PfisicaModel();
//        pfisica.setIdCliente(8);
//        pfisica.setCpf("12538119631");
//        pfisica.setNome("LeonardoSartori");
//        pfisica.setCep("32015030");
//        pfisica.setComplemento("apto 203");
//        pfisica.setNumCartao("56874589000");
//        pfisica.setNumConta("12312345");
//        pfisica.setNumero("101");
//        pfisica.setTelefone("33910155");
//        pfisica.delete();
//        //System.out.println(pfisica.toString());

        //TESTE PJURIDICA
//        PjuridicaDAO  pjuridicadao = new PjuridicaDAO();
//        PjuridicaModel pjuridica = new PjuridicaModel();
//        pjuridica.setIdCliente(9);
//        pjuridica.setCnpj("334455667788");
//        pjuridica.setNome("Empresa do leleo");
//        pjuridica.setCep("1508967");
//        pjuridica.setComplemento("galpao");
//        pjuridica.setNumero("8888");
//        pjuridica.setNumCartao("0987543");
//        pjuridica.setNumConta("0011002");
//        pjuridicadao.excluir(pjuridica);
//        //System.out.println(pjuridica.toString());
        
        //TESTE Pvenda
//        PvendaDAO pvendadao = new PvendaDAO();
//        PvendaModel pvenda = new PvendaModel();
//        pvenda.setIdVeiculo(2);
//        pvenda.setPrecoVenda(160000);
//        pvenda.get(2);
//        pvenda.delete();
//        //System.out.println(pvenda.toString());

        //TESTE REVISAO
//        RevisaoModel revisao = new RevisaoModel();
//        RevisaoDAO revisaodao = new RevisaoDAO();
//        ClienteModel cliente = new ClienteModel(2);
//        MecanicoModel mecanico = new MecanicoModel("33344455511");
//        VeiculoModel veiculo = new VeiculoModel(10);
//        revisao.setIdRevisao(7);
//        revisao.setCliente(cliente);
//        revisao.setMecanico(mecanico);
//        revisao.setVeiculo(veiculo);
//        revisao.setDataRevisao("11/11/2019");
//        revisao.setEfetivado(true);
//        revisao.setValorRevisao(20);
//        revisao.setValorConserto(700);
//        revisao.delete();
//       // System.out.println(revisao.toString());
//        revisaodao.alterar(revisao);

        //TESTE VEICULO
//        VeiculoModel veiculo = new VeiculoModel();
//        VeiculoDAO veiculodao = new VeiculoDAO();
//        veiculo.setIdVeiculo(11);
//        veiculo.setCor("verde");
//        veiculo.setKm(0);
//        veiculo.setModelo("sedan");
//        veiculo.setMontadora("ford");
//        veiculo.setPlaca("");
//        veiculo.setTipo("carro");
//        veiculo.setSituacao(2);
//        veiculo.delete();
//        //System.out.println(veiculo.toString());
        
        //TESTE MECANICO
//        MecanicoDAO mecanicodao = new MecanicoDAO();
//        MecanicoModel mecanico = new MecanicoModel();
//        //mecanico.setCpfFuncionario("33344455511");
//        mecanico = mecanico.get("33344455511");
//        System.out.println(mecanico.toString());
    }
    
}
