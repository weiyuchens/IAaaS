package com.gbtech.iaaas.controller.manage;

import com.gbtech.iaaas.common.api.Paginator;
import com.gbtech.iaaas.common.api.Result;
import com.gbtech.iaaas.mbg.model.AeStaff;
import com.gbtech.iaaas.service.StaffService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@Api(tags = "StaffController", description = "企业人员管理")
@RestController
@RequestMapping("/manage/staff")
public class StaffController {

    @Autowired
    private StaffService staffService;

    private static final Logger logger = LoggerFactory.getLogger(AccommodationController.class);

    @ApiOperation("注册新员工")
    @RequestMapping(method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    @ResponseBody
    public Result registerStaff(@RequestBody AeStaff aeStaff) {
        Result result;
        logger.info(
                "Request Interface: '/manage/staff', " + "Request Content: " + aeStaff.toString());
        int count = staffService.registerStaff(aeStaff);
        if (count == 1) {
            result = Result.success(staffService, "注册新员工成功");
            logger.info("Register a new staff successful: {}", aeStaff);
        } else {
            result = Result.failed("注册新员工失败");
            logger.info("Register a new staff failed: {}", aeStaff);
        }
        return result;
    }

    @ApiOperation("获取员工列表")
    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public Result<Paginator<AeStaff>> getStaffList(
            @RequestParam(value = "pageNum", defaultValue = "1")
            @ApiParam("页码") Integer pageNum,
            @RequestParam(value = "pageSize", defaultValue = "10")
            @ApiParam("每页数量") Integer pageSize) {
        List<AeStaff> staffList = staffService.getStaffList(pageNum, pageSize);
        logger.info("Request Interface: '/manage/staff'");
        logger.info("Get staff list successful: {}", staffList.toString());
        return Result.success(Paginator.restPage(staffList), "获取员工列表成功");
    }

}