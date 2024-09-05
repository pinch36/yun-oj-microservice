package yun.oj.model.model.dto.postfavour;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import yun.oj.common.common.PageRequest;
import yun.oj.model.model.dto.post.PostQueryRequest;

/**
 * 帖子收藏查询请求
 *

 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PostFavourQueryRequest extends PageRequest implements Serializable {

    /**
     * 帖子查询请求
     */
    private PostQueryRequest postQueryRequest;

    /**
     * 用户 id
     */
    private Long userId;

    private static final long serialVersionUID = 1L;
}