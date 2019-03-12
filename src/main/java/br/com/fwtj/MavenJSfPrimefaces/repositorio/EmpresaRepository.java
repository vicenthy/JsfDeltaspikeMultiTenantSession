package br.com.fwtj.MavenJSfPrimefaces.repositorio;

import br.com.fwtj.MavenJSfPrimefaces.modelo.Empresa;
import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.hibernate.Session;

import javax.inject.Inject;

public abstract class EmpresaRepository extends AbstractEntityRepository<Empresa, Long> {

    @Inject
    private Session session;


}
