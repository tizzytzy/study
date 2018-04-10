package com.qingguatang.product.api;

import com.qingguatang.product.model.MediaPageResult;
import com.qingguatang.product.param.MediaSearchParam;

public interface MediaSearchApi {

  public MediaPageResult query(MediaSearchParam param);



}
