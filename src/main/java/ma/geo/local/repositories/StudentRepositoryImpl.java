package ma.geo.local.repositories;

import ma.geo.local.entities.StudentEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentRepositoryImpl implements StudentRepository{
    @Override
    public StudentEntity save(StudentEntity dto) {
        return null;
    }

    @Override
    public StudentEntity update(StudentEntity dto) {
        return null;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }

    @Override
    public List<StudentEntity> selectAll() {
        return null;
    }
}
