package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

//    Owner findById(Long id);
//
//    Owner save(Owner owner);
//
//    Set<Owner> findAll();

}
