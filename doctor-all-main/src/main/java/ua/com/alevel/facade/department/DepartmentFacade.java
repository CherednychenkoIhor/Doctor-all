package ua.com.alevel.facade.department;

import ua.com.alevel.facade.BaseFacade;
import ua.com.alevel.persistence.entity.department.DoctorsDepartment;
import ua.com.alevel.persistence.type.DoctorSpecialization;
import ua.com.alevel.web.dto.request.department.DepartmentRequestDto;
import ua.com.alevel.web.dto.response.department.DepartmentResponseDto;

import java.util.List;

public interface DepartmentFacade extends BaseFacade<DepartmentRequestDto, DepartmentResponseDto> {

    List<DepartmentResponseDto> findAll();

    DoctorsDepartment findDepartmentBySpecialization(DoctorSpecialization doctorSpecialization);
}
