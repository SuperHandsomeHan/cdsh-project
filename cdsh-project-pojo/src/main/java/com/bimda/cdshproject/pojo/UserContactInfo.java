package com.bimda.cdshproject.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;


/**
 * <p>
 * contact_list 通讯录
 * </p>
 *
 * @author jobob
 * @since 2020-11-11
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "user_contact_info")
public class UserContactInfo {

    private static final long serialVersionUID = 1L;

    @TableId
    /** user_id;用户编号 */
    @Id
    @ApiModelProperty("用户编号")
    private String userId ;

    /** user_fixed_tel;用户电话号码 */
    @ApiModelProperty("用户电话号码")
    private String userFixedTel ;

    /** user_fax;用户传真 */
    @ApiModelProperty("用户传真")
    private String userFax ;

    /** user_wechat;用户微信号 */
    @ApiModelProperty("用户微信号")
    private String userWechat ;

    /** user_qq;用户QQ号 */
    @ApiModelProperty("用户QQ号")
    private String userQq ;

    /** user_ali;用户阿里旺旺号 */
    @ApiModelProperty("用户阿里旺旺号")
    private String userAli ;

    /** user_email;用户邮箱 */
    @ApiModelProperty("用户邮箱")
    private String userEmail ;

    /** website;网址 */
    @ApiModelProperty("网址")
    private String website ;


}
