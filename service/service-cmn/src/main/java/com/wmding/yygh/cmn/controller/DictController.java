package com.wmding.yygh.cmn.controller;

import com.wmding.yygh.cmn.service.DictService;
import com.wmding.yygh.common.util.result.Result;
import com.wmding.yygh.model.cmn.Dict;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author 明月
 * @version 1.0
 * @date 9/7/21 8:47 PM
 * @description:
 */
@Api(tags = "字典数据管理")
@RestController
@RequestMapping("/admin/cmn/dict")
@CrossOrigin
public class DictController {

    @Autowired
    private DictService dictService;

    /**
     * 根据数据id查询子数据列表
     *
     * @param id
     * @return
     */
    @ApiOperation(value = "根据数据id查询子数据列表")
    @GetMapping("findChildData/{id}")
    public Result findChildData(@PathVariable Long id) {
        List<Dict> dataList = dictService.findChildData(id);
        return Result.ok(dataList);
    }

    @ApiOperation(value="导出")
    @GetMapping(value = "exportData")
    public void exportData(HttpServletResponse response) {
        dictService.exportData(response);
    }

    @ApiOperation(value = "导入")
    @PostMapping("importData")
    public Result importData(MultipartFile file) {
        dictService.importData(file);
        return Result.ok();
    }
}
