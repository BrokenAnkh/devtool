package so.mapper;

import so.entity.PermissionMenu;

public interface PermissionMenuMapper {
    int deleteByPrimaryKey(String menuId);

    int insert(PermissionMenu record);

    int insertSelective(PermissionMenu record);

    PermissionMenu selectByPrimaryKey(String menuId);

    int updateByPrimaryKeySelective(PermissionMenu record);

    int updateByPrimaryKey(PermissionMenu record);
}