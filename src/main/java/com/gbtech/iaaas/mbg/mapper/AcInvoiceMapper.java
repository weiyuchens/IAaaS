package com.gbtech.iaaas.mbg.mapper;

import com.gbtech.iaaas.mbg.model.AcInvoice;
import com.gbtech.iaaas.mbg.model.AcInvoiceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AcInvoiceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_invoice
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    long countByExample(AcInvoiceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_invoice
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    int deleteByExample(AcInvoiceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_invoice
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_invoice
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    int insert(AcInvoice row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_invoice
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    int insertSelective(AcInvoice row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_invoice
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    List<AcInvoice> selectByExampleWithBLOBs(AcInvoiceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_invoice
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    List<AcInvoice> selectByExample(AcInvoiceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_invoice
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    AcInvoice selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_invoice
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    int updateByExampleSelective(@Param("row") AcInvoice row, @Param("example") AcInvoiceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_invoice
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    int updateByExampleWithBLOBs(@Param("row") AcInvoice row, @Param("example") AcInvoiceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_invoice
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    int updateByExample(@Param("row") AcInvoice row, @Param("example") AcInvoiceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_invoice
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    int updateByPrimaryKeySelective(AcInvoice row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_invoice
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    int updateByPrimaryKeyWithBLOBs(AcInvoice row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_invoice
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    int updateByPrimaryKey(AcInvoice row);
}