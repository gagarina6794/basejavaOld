package model;

/**
 * com.urise.webapp.model.model.Resume class
 */
public class Resume implements Comparable<Resume> {

    private String uuid;

    public Resume(String uuid) {
        this.uuid = uuid;

    }

    public Resume() {
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Override
    public String toString() {
        return uuid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Resume resume = (Resume) o;
        return uuid.equals(resume.uuid);
    }

    @Override
    public int hashCode() {
        return uuid.hashCode();
    }

    @Override
    public int compareTo(Resume o) {
        if (o.getUuid() != null) {
            return uuid.compareTo(o.uuid);
        }
        return -1;
    }
}
