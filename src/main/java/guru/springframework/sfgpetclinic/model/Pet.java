package guru.springframework.sfgpetclinic.model;

import java.time.LocalDate;

public class Pet {

    private guru.springframework.sfgdi.model.PetType petType;
    private guru.springframework.sfgdi.model.Owner owner;
    private LocalDate birthDate;

    public guru.springframework.sfgdi.model.PetType getPetType() {
        return petType;
    }

    public void setPetType(guru.springframework.sfgdi.model.PetType petType) {
        this.petType = petType;
    }

    public guru.springframework.sfgdi.model.Owner getOwner() {
        return owner;
    }

    public void setOwner(guru.springframework.sfgdi.model.Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
