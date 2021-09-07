package com.wmding.yygh.cmn.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wmding.yygh.model.cmn.Dict;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author 明月
 * @version 1.0
 * @date 9/7/21 8:40 PM
 * @description:
 */
public interface DictService extends IService<Dict> {
    /**
     * 根据数据id查询子数据列表
     *
     * @param id
     * @return
     */
    List<Dict> findChildData(Long id);

    void exportData(HttpServletResponse response);

    void importData(MultipartFile file);
}