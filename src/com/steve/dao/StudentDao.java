package com.steve.dao;

import java.util.List;

import com.steve.entity.StudentEntity;
/**
 * Data Access Object Interface
 * ���ݷ��ʲ�ӿ�
 * @author Ou Shaobin
 * @since 2016.09.24 15.11
 */
public interface StudentDao {

	
	/**
	 * ��������ѧ���ļ�¼
	 * @param student
	 */
	public void createStudent(StudentEntity student);
	
	/**
	 * ɾ������ѧ���ļ�¼
	 * @param studentNumber
	 */
	public void deleteStudent(String studentNumber);

	/**
	 * ��ȡĳ��ѧ���ļ�¼ [����ѧ��]
	 * @param studentNumber
	 * @return 
	 */
	public StudentEntity readStudent(String studentNumber);
	
	/**
	 * ��ѯ�������ݱ������еļ�¼
	 */
	public List<StudentEntity> queryAll();
	
	/**
	 * ����ĳ��ѧ��������
	 * @param student
	 */
	public void updateStudent(StudentEntity student);
}
