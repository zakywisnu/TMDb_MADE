package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new com.zeroemotion.tmdb_made.DataBinderMapperImpl());
    addMapper("com.zeroemotion.tmdb_made.trending");
  }
}
