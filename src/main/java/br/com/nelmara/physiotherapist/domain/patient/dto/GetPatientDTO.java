package br.com.nelmara.physiotherapist.domain.patient.dto;

import br.com.nelmara.physiotherapist.domain.treatment.history.dto.GetTreatmentHistoryDTO;
import br.com.nelmara.physiotherapist.domain.patient.Gender;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class GetPatientDTO implements Serializable {

        private static final long serialVersionUID = 1L;

        private Long id;
        private String firstName;
        private String lastName;
        private Date dateOfBirth;
        private String address;
        private String email;
        private String phone;
        private Gender gender;
        private String profession;
        private String indication;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;
        private List<GetTreatmentHistoryDTO> treatmentHistories;

        public GetPatientDTO() {}

        public GetPatientDTO(Long id, String firstName, String lastName, Date dateOfBirth, String address,
                             String email, String phone, Gender gender,
                             String profession, String indication, LocalDateTime createdAt,
                             LocalDateTime updatedAt, List<GetTreatmentHistoryDTO> treatmentHistories) {
            this.id = id;
            this.firstName = firstName;
                this.lastName = lastName;
                this.dateOfBirth = dateOfBirth;
                this.address = address;
                this.email = email;
                this.phone = phone;
                this.gender = gender;
                this.profession = profession;
                this.indication = indication;
                this.createdAt = createdAt;
                this.updatedAt = updatedAt;
                this.treatmentHistories = treatmentHistories;
        }

        public String getFirstName() {
                return firstName;
        }

        public void setFirstName(String firstName) {
                this.firstName = firstName;
        }

        public String getLastName() {
                return lastName;
        }

        public void setLastName(String lastName) {
                this.lastName = lastName;
        }

        public Date getDateOfBirth() {
                return dateOfBirth;
        }

        public void setDateOfBirth(Date dateOfBirth) {
                this.dateOfBirth = dateOfBirth;
        }

        public String getAddress() {
                return address;
        }

        public void setAddress(String address) {
                this.address = address;
        }

        public String getEmail() {
                return email;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        public String getPhone() {
                return phone;
        }

        public void setPhone(String phone) {
                this.phone = phone;
        }

        public Gender getGender() {
                return gender;
        }

        public void setGender(Gender gender) {
                this.gender = gender;
        }

        public String getProfession() {
                return profession;
        }

        public void setProfession(String profession) {
                this.profession = profession;
        }

        public String getIndication() {
                return indication;
        }

        public void setIndication(String indication) {
                this.indication = indication;
        }

        public LocalDateTime getCreatedAt() {
                return createdAt;
        }

        public void setCreatedAt(LocalDateTime createdAt) {
                this.createdAt = createdAt;
        }

        public LocalDateTime getUpdatedAt() {
                return updatedAt;
        }

        public void setUpdatedAt(LocalDateTime updatedAt) {
                this.updatedAt = updatedAt;
        }

        public List<GetTreatmentHistoryDTO> getTreatmentHistories() {
                return treatmentHistories;
        }

        public void setTreatmentHistories(List<GetTreatmentHistoryDTO> treatmentHistories) {
                this.treatmentHistories = treatmentHistories;
        }

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        @Override
        public boolean equals(Object o) {

                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                GetPatientDTO that = (GetPatientDTO) o;
                return Objects.equals(id, that.id) && Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName) && Objects.equals(dateOfBirth, that.dateOfBirth) && Objects.equals(address, that.address) && Objects.equals(email, that.email) && Objects.equals(phone, that.phone) && gender == that.gender && Objects.equals(profession, that.profession) && Objects.equals(indication, that.indication) && Objects.equals(createdAt, that.createdAt) && Objects.equals(updatedAt, that.updatedAt) && Objects.equals(treatmentHistories, that.treatmentHistories);
        }

        @Override
        public int hashCode() {
                return Objects.hash(id, firstName, lastName, dateOfBirth, address, email, phone, gender, profession, indication, createdAt, updatedAt, treatmentHistories);
        }
}
