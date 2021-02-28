package guru.springframework.sfgpetclinic.model;

import java.time.LocalDate;

public class Pet extends BaseEntity{

    private guru.springframework.sfgpetclinic.model.PetType petType;
    private guru.springframework.sfgpetclinic.model.Owner owner;
    private LocalDate birthDate;

    public guru.springframework.sfgpetclinic.model.PetType getPetType() {
        return petType;
    }

    public void setPetType(guru.springframework.sfgpetclinic.model.PetType petType) {
        this.petType = petType;
    }

    public guru.springframework.sfgpetclinic.model.Owner getOwner() {
        return owner;
    }

    public void setOwner(guru.springframework.sfgpetclinic.model.Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
