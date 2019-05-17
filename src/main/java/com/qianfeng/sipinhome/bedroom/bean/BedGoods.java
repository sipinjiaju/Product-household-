package com.qianfeng.sipinhome.bedroom.bean;


import com.qianfeng.sipinhome.bedroom.vo.BedroomVo;

import java.util.List;

public class BedGoods {

  private long bedGoodsId;
  private String bedGoodsName;
  private long bedroomId;
  private List<BedroomVo> bedroomVos;

  public List <BedroomVo> getBedroomVos() {
    return bedroomVos;
  }

  public void setBedroomVos(List <BedroomVo> bedroomVos) {
    this.bedroomVos = bedroomVos;
  }

  public long getBedGoodsId() {
    return bedGoodsId;
  }

  public void setBedGoodsId(long bedGoodsId) {
    this.bedGoodsId = bedGoodsId;
  }


  public String getBedGoodsName() {
    return bedGoodsName;
  }

  public void setBedGoodsName(String bedGoodsName) {
    this.bedGoodsName = bedGoodsName;
  }


  public long getBedroomId() {
    return bedroomId;
  }

  public void setBedroomId(long bedroomId) {
    this.bedroomId = bedroomId;
  }

}
