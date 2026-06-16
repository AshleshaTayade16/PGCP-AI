import scrapy


class QuotescraperSpider(scrapy.Spider):
    name = "quotescraper"
    allowed_domains = ["'https:"]
    start_urls = ["https://quotes.toscrape.com/"]

    def parse(self, response):
        quotes = response.css('div.quote')
        for book in quotes:
            yield {
                'quote':book.css('span::text').get(),
                'author':book.css('small.author::text').get()
            }
