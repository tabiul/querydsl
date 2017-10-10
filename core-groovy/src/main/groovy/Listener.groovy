import javax.persistence.PrePersist

class Listener {
    @PrePersist
    def beforePersist(person) {
    }
}
