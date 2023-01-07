package cn.woniu.service.manage.impl;

import cn.woniu.dao.manage.GoodsDao;
import cn.woniu.dao.manage.GoodsTypeDao;
import cn.woniu.entity.manage.Goods;
import cn.woniu.entity.manage.GoodsType;
import cn.woniu.service.manage.GoodsTypeService;
import cn.woniu.utils.ResponseResult;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


/**
 * (GoodsType)表服务实现类
 *
 * @author makejava
 * @since 2023-01-05 11:38:53
 */
@Service
public class GoodsTypeServiceImpl implements GoodsTypeService {

    @Autowired(required = false)
    private GoodsTypeDao goodsTypeDao;
    @Autowired(required = false)
    private GoodsDao goodsDao;

    @Override
    public ResponseResult<?> queryType1(String name,Integer pageSize,Integer pageNum) {
        QueryWrapper<GoodsType> queryWrapper=new QueryWrapper<GoodsType>();
        queryWrapper.like("name",name);
        queryWrapper.in("status","1","0");
        queryWrapper.isNull("parent_id");
        PageHelper.startPage(pageNum, pageSize);
        PageInfo<GoodsType> pageInfo = new PageInfo<>(goodsTypeDao.selectList(queryWrapper));
        return new ResponseResult<>().ok(pageInfo);
    }

    @Override
    public ResponseResult<?> queryType2(String id) {
        QueryWrapper<GoodsType> queryWrapper=new QueryWrapper<GoodsType>();
        queryWrapper.eq("parent_id",id);
        queryWrapper.in("status","1","0");
        List<GoodsType> list=goodsTypeDao.selectList(queryWrapper);
        return new ResponseResult<>().ok(list);
    }

    @Override
    public ResponseResult<?> addType1(String name) {
        QueryWrapper<GoodsType> queryWrapper=new QueryWrapper<GoodsType>();
        queryWrapper.eq("name",name);
        List<GoodsType> list = goodsTypeDao.selectList(queryWrapper);
        if(list.size()>0 || name.isEmpty()){
            return ResponseResult.FAILURE;
        }
        GoodsType goodsType=new GoodsType();
        goodsType.setName(name);
        goodsType.setParentId(null);
        goodsType.setStatus(1);
        int insert = goodsTypeDao.insert(goodsType);
        if (insert==1)
            return new ResponseResult<>().ok(insert);
        else
            return ResponseResult.FAILURE;
    }

    @Override
    public ResponseResult<?> addType2(String name, String id) {
        QueryWrapper<GoodsType> queryWrapper=new QueryWrapper<GoodsType>();
        queryWrapper.eq("name",name);
        List<GoodsType> list = goodsTypeDao.selectList(queryWrapper);
        if(list.size()>0 || name.isEmpty()){
            return ResponseResult.FAILURE;
        }
        GoodsType goodsType=new GoodsType();
        goodsType.setName(name);
        goodsType.setParentId(id);
        goodsType.setStatus(1);
        int insert = goodsTypeDao.insert(goodsType);
        if (insert==1)
            return new ResponseResult<>().ok(insert);
        else
            return ResponseResult.FAILURE;
    }

    @Override
    public ResponseResult<?> updateType(String name, String id) {

        QueryWrapper<GoodsType> queryWrapper=new QueryWrapper<GoodsType>();
        queryWrapper.eq("name",name);
        List<GoodsType> list = goodsTypeDao.selectList(queryWrapper);
        if(list.size()>0){
            return ResponseResult.FAILURE;
        }
        GoodsType goodsType = goodsTypeDao.selectById(id);
        goodsType.setName(name);
        int count = goodsTypeDao.updateById(goodsType);
        if (count==1){
            return new ResponseResult<>().ok(count);
        }else{
            return ResponseResult.FAILURE;
        }
    }

    @Override
    public ResponseResult<?> deleteType(String status, String id) {

        if (status.equals("2")){
            QueryWrapper<GoodsType> queryWrapper=new QueryWrapper<GoodsType>();
            queryWrapper.eq("parent_id",id);
            List<GoodsType> list = goodsTypeDao.selectList(queryWrapper);
            if(list.size()>0){
                return new ResponseResult(202,"有子类别!删除失败");
            }
            QueryWrapper<Goods> queryWrapper1=new QueryWrapper<Goods>();
            queryWrapper1.eq("goods_type_id",id);
            List<Goods> list1 = goodsDao.selectList(queryWrapper1);
            if(list1.size()>0){
                return new ResponseResult(203,"该类别下有商品!删除失败");
            }
        }
        if(status.equals("0")){
            QueryWrapper<GoodsType> queryWrapper=new QueryWrapper<GoodsType>();
            queryWrapper.eq("parent_id",id);
            List<GoodsType> list = goodsTypeDao.selectList(queryWrapper);
            if(list.size()>0)
            for (GoodsType e:list
                 ) {
                e.setStatus(0);
                goodsTypeDao.updateById(e);
            }
        }
        GoodsType goodsType = goodsTypeDao.selectById(id);
        goodsType.setStatus(Integer.valueOf(status));
        int count = goodsTypeDao.updateById(goodsType);
        if (count==1){
            return new ResponseResult<>().ok(count);
        }else{
            return ResponseResult.FAILURE;
        }
    }

}

